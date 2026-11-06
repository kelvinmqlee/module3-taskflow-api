Module 4 Mandatory Assignment - TaskFlow API



--- Live Application URL on Render ---

https://module3-taskflow-api-9an9.onrender.com/api/tasks



--- Screenshots ---

Screenshot: Render Dashboard

![Render Deployment Dashboard 1](screenshots/renderdashboard1.jpg)

![Render Deployment Dashboard 2](screenshots/renderdashboard2.jpg)

![Render Deployment Dashboard 3](screenshots/renderdashboard3.jpg)

![Render Deployment Dashboard 4](screenshots/renderdashboard4.jpg)


Screenshot: Live Application

![Live Application URL working](screenshots/liveapplicationurlworking.jpg)



--- Errors and Failures ---

1. Encountered a failed Pipeline run when publishing on GitHub Actions for the first run. Rectified it by adding Repository Secrets to the corresponding Github Repository.



--- Stretch Goal (optional) ---

Stretch goal: Option 1 - Add a CI Pipeline


Links: 
1. Successful Pipeline Run with GitHub Actions - https://github.com/kelvinmqlee/module3-taskflow-api/actions/runs/42173273883/job/127752668175

![All Checks Have Passed](screenshots/allcheckshavepassed.jpg)

![Successful Pipeline Run with GitHub Actions](screenshots/githubactionscijob.jpg)


2. Successful Pipeline Run with CircleCI - https://app.circleci.com/pipelines/gh/kelvinmqlee/module3-taskflow-api/1/details?useNewPipelines=true&workflowId=e3c98766-2b0b-43d2-84de-2e30ffb23207

![Successful Pipeline Run with CircleCI](screenshots/circlecijob.jpg)


3. Latest Image on Docker Hub - https://hub.docker.com/repository/docker/kelvinmqlee/taskflow/general

![Latest Image on Docker Hub](screenshots/latestimageondockerhub.jpg)


Notes: 
After clarification with trainer Jesstern, I learned that there is no conflict if I add both GitHub Actions and CircleCI Pipeline Run in the same project, therefore I proceeded to add both in this assignment.

