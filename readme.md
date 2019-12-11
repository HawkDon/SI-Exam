## Requisite

(Have Docker installed())[https://www.docker.com/]
(Have Kubernetes installed)[https://kubernetes.io/]
((Prefered) Have Skaffold installed)[https://github.com/GoogleContainerTools/skaffold]


## Docker-Compose (UNSTABLE_LEGACY)

- 1. `sh git clone {project}`
- 2. `sh docker-compose up`

## Kubernetes Skaffold (PREFERRED)

- 1. `sh kubectl apply -f k8s` to apply kubernetes objects
- 2. `sh kubectl delete deployment frontend-deployment && kubectl delete deployment backend-deployment` to delete production objects we would like to run as development
- 3. `sh skaffold dev --trigger notify` to run our frontend and backend in development
