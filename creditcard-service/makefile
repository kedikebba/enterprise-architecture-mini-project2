

containerID := $(shell docker ps -a -q --filter ancestor=kedikebba/creditcard-service:latest)

#===================  gradle  ===========================
clean:
	./mvnw clean
build: clean
	./mvnw install

#===================  docker  ===========================
docker-build: build
	docker build -t kedikebba/creditcard-service:latest .


docker-run: docker-build
	docker run -p 8080:8080 kedikebba/creditcard-service:latest


docker-login:
	docker login

docker-push: docker-login docker-build
	docker push kedikebba/creditcard-service:latest

docker-bash:
	docker exec -ti kedikebba/creditcard-service:latest /bin/sh

docker-containerID:
	@echo running: $(containerID)

docker-stop:
	docker stop $(containerID)

docker-remove:
	docker rm $(containerID)

#remove all unused images
docker-prune:
	docker image prune -a -f


#===================  minikube  ===========================

#Use Docker of your host to communicate with the Docker daemon inside the Minikube VM:
k8s-use-minikube-docker:
	@eval $$(minikube docker-env) 
	echo "$$(minikube docker-env)"

k8s-deployment-create: k8s-use-minikube-docker  docker-push
	kubectl apply -f k8s-deployment.yaml
k8s-deployment-delete:
	kubectl delete -f k8s-deployment.yaml


k8s-service-create:
	kubectl apply -f k8s-service.yaml
k8s-service-delete:
	kubectl delete -f k8s-service.yaml

k8s-service-url:
	$(eval k8s-service-name=$(shell sh -c "kubectl get -f k8s-service.yaml | grep -v NAME" | awk '{print $$1}'))
	minikube service ${k8s-service-name} --url


k8s-configmap-create:
	kubectl apply  -f k8s-config-map.yaml
k8s-configmap-delete:
	kubectl delete -f k8s-config-map.yaml


k8s-secrets-create:
	kubectl apply  -f k8s-secrets.yaml
k8s-secrets-delete:
	kubectl delete -f k8s-secrets.yaml

#define access for default service account on K8s to grant list resources
k8s-role-create:
	kubectl apply -f k8s-role.yaml
k8s-role-delete:
	kubectl delete -f k8s-role.yaml


k8s-persistence-create:
	echo "create initial db, run this when DB service is ready"
	echo "kubectl run -it --rm --image=mysql:5.6 --restart=Never mysql-client -- mysql -h creditcard-service-db -ppassword -e 'create database db_example;'"

k8s-info:
	kubectl cluster-info
	kubectl get pv
	kubectl get pvc
	kubectl get secrets
	kubectl get configmaps
	kubectl get services
	kubectl get pods
	echo "You can also check DB via:\n kubectl run -it --rm --image=mysql:5.6 --restart=Never mysql-client -- mysql -h creditcard-service-db -ppassword "



k8s-all-create: k8s-configmap-create k8s-secrets-create k8s-role-create k8s-deployment-create k8s-service-create
	echo "Done"
k8s-all-delete: k8s-configmap-delete k8s-secrets-delete k8s-deployment-delete k8s-service-delete
	echo "Done"


k8s-all-reset: k8s-all-delete k8s-all-create









