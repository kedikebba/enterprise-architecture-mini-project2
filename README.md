# Mini project II in spring boot with Microservices and Kubernates
This Project uses JWT authentication for  users:

```bash
Create an account with signup

http://localhost:8085/api/signup

Login with the email and password

http://localhost:8085/api/signin


```

# Requirements


•	Apache Maven 3.6.2


•	Google Cloud Platform  Cloud Shell 


•	For building and running the command you need:

		Kubernetes

		MySQl installation on Cloud shell


## Install MySQl 5.x in Google Cloud Platform

```bash
gcloud docker -- pull launcher.gcr.io/google/mysql5

```

## Start a MySQL instance

```bash
Copy the following content to pod.yaml file

apiVersion: v1
kind: Pod
metadata:
  name: some-mysql
  labels:
    name: some-mysql
spec:
  containers:
    - image: launcher.gcr.io/google/mysql5
      name: mysql
      env:
        - name: "MYSQL_ROOT_PASSWORD"
          value: "example-password"

```

```bash


kubectl create -f pod.yaml.

```

```bash	

Run the command to expose the port	

kubectl expose pod some-mysql --name some-mysql-3306 \
  --type LoadBalancer --port 3306 --protocol TCP
  
```

## Build an executable JAR file for each microservices:

```bash
	mvn clean install
			
```

## Dockerize the microservices:

```bash
	mvn com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/$$GOOGLE_CLOUD_PROJECT/DatabaseName:v1
	
	gcloud container clusters get-credentials ea-cluster-1 --zone us-central1-a
	
	kubectl run DatabaseName --image=gcr.io/$$GOOGLE_CLOUD_PROJECT/DatabaseName:v1 --port=port_no
	
	kubectl expose deployment DatabaseName --type=LoadBalancer 

```

## Scale the instances:
```bash
	kubectl scale deployment DatabaseName --replicas=numberOfReplicas 
```


## Login to database:

```bash
	kubectl exec -it DatabaseName-db-mysql -- mysql -uUSERNAME -pPASSWORD 
```

## Check the tables and data

## Authors Wagobera Edgar Kedi and Sunena Gwachha
