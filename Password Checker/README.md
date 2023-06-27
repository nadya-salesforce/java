# Класс PasswordChecker
объект которого умеет проверять надёжность пароля.

У этого класса методы-настройки:

setMinLength — сеттер установки минимально допустимой длины пароля. Если в сеттер передали недопустимое значение (отрицательное число), то 
выкидывается исключение IllegalArgumentException, т. е. исключение недопустимого аргумента, с соответствующим сообщением;

setMaxRepeats — сеттер установки максимально допустимого количества повторений символа подряд. Если в сеттер передали недопустимое значение (отрицательное число или 0), 
то выкидывается исключение IllegalArgumentException, т. е. исключение недопустимого аргумента, с соответствующим сообщением.

И метод проверки boolean verify(String password), который проверяет переданный пароль на эти два критерия. Если пароль проходит, возвращает true, не проходит — false. 
Если до вызова метода verify хотя бы одна из двух вышеперечисленных настроек не была выставлена чекеру, то кидается исключение IllegalStateException, 
т. е. исключение недопустимого состояния, с соответствующим сообщением.

## Пример работы программы:
Введите мин. длину пароля: 5

Введите макс. допустимое количество повторений символа подряд: 2

Введите пароль или end: pas
Не подходит!

Введите пароль или end: passssword
Не подходит!

Введите пароль или end: password
Подходит!

Введите пароль или end: end

Программа завершена