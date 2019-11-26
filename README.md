
docker build -t mydockerimage . 

docker run -p 5000:8080 mydockerimage

docker login 

USERNAME : kkataria1983
PASSWORD : De......





docker tag image username/repository:tag

docker tag mydockerimage kkataria1983/mydockerimage:0.0.1-SNAPSHOT


docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagname


docker tag mydockerimage kkataria1983/scuticommerce:v1


docker push kkataria1983/scuticommerce:v1


minikube start
 
minikube status 
 
minikube dashboard

kubectl run mydocker --image=kkataria1983/scuticommerce:tagname --port=80

kubectl run mydocker --image=kkataria1983/scuticommerce:tagname --port=80

 kubectl get deployments


kubectl expose deployment mydocker --type=NodePort


kubectl get services


 
 $ kubectl get nodes NAME STATUS ROLES AGE VERSION

 $ kubectl get pod No resources found.
 $ kubectl get deployments No resources found.
 $ minikube dashboard

kubectl create -f deployment.yml


kubectl set image mydockertestdeployment mydockertest=kkataria1983/scuticommerce:mydockerimage --record

minikube ip



to view logs of pods

minikube ssh
cd /var/log/containers

