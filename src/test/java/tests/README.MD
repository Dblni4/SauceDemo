# **Тест-кейс1**
## **Название:** _Авторизация пользователя с валидными данными_
### Шаги выполнения:
1. Перейти на страницу [Sausdemo](https://www.saucedemo.com/)
2. Ввести в поле "Username" валидные данные "standard_user"
3. Ввести в поле "Password" валидные данные "secret_sauce"
4. Нажать на кнопку "Login"
5. Наблюдать в левом верхнем углу страницы надпись "Products"
### Ожидаемый результат:
Надпись "Products" отображается на экране в левом верхнем углу

# **Тест-кейс2**
## **Название:** _Авторизация пользователя с невалидными данными_
### Шаги выполнения:
1. Перейти на страницу [Sausdemo](https://www.saucedemo.com/)
2. Ввести в поле "Username" валидные данные "wrong-user"
3. Ввести в поле "Password" валидные данные "wrong-password"
4. Нажать на кнопку "Login"
5. Наблюдать на странице ошибку "_Epic sadface: You can only access
'/inventory.html' when you are logged in._"
### Ожидаемый результат:
Надпись "Epic sadface: You can only access
'/inventory.html' when you are logged in." отображается на экране