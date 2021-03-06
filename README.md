[![CI](https://github.com/ArvikVan/user-service/actions/workflows/Createmain.yml/badge.svg?branch=master)](https://github.com/ArvikVan/user-service/actions/workflows/Createmain.yml)
## tr-project user-servise
Создать проект на базе микросервисной архитектуры (использовать язык
Java).
Проект должен состоять из двух микросервисов: авторизационный и
пользовательский.<br>
1. Авторизационный<br>
   Содержит один REST метод(можно больше):<br>
   1.1 Авторизация<br>
   Входные данные: логин:пароль<br>
   Ответ: JWT<br>
**2. Пользовательский<br>
   Должен содержать следующие REST методы (требуют валидный токен
   JWT):<br>
   2.1 Поиск пользователя по логину.<br>
   2.2 Получение всех пользователей<br>
   Функционал доступный только пользователю с ролью ADMIN:<br>
   2.3 Получение списка пользователей по определенной роли.<br>
   2.4 Получение пользователя по идентификатору.<br>
   2.5 Создание нового пользователя.**
   <br>Для микросервиса следует спроектировать необходимые сущности и
   реализовать их на базе JPA. Инфраструктура микросервиса должна
   содержать: gateway, registry, microservices. Хранение данных следует
   организовать в любой клиент-серверной реляционной СУБД. При разработке
   микросервиса следует использовать Spring Boot, Spring Cloud, Spring Security,
   Spring Data. Микросервис должен быть собран в образ docker (требуется
   предоставить файл запуска в docker-compose). Для демонстрации работы
   проекта необходим простой web-интерфейс. Результат следует разместить на
   github.<br>
![](img/1.png)<br>
![](img/2.png)<br>
![](img/3.png)<br>
![](img/4.png)<br>
![](img/5.png)<br>


### Контакты для связи<br>
<img src="https://img.icons8.com/clouds/100/000000/gmail-new.png" width="10"/> arvikvan@gmail.com<br>
<img src="https://img.icons8.com/color/100/000000/telegram-app--v2.png" width="10"/> @ArvikV

###Используемые технологии:
- Gradle
- GitHub Action
- Spring (boot, data)
- Lombok


