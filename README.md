# springboot-rabbitmq-example
Project example to show how to configure, publish and consume messages using Spring Boot and RabbitMQ


How to use RabbitMQ with Publisher and Consumer Example

Install RabbitMQ in windows :
1-Downlaod and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
  * OBS: If you prefer and have a docker installed run the command: 
  * docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
  * Jump to step 4
2-Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
3-Run command rabbitmq-plugins enable rabbitmq_management
4-Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
5-Also we can Open it with IP Address http://127.0.0.1:15672
Login page default username and password is guest
After successfully login you should see RabbitMQ Home page
