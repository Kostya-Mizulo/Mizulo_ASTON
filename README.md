**Мизуло Константин**

**ASTON**

Реализован проект согласно ТЗ - Задание 2: https://docs.google.com/document/d/1kQPb6MAZyVcajn-T1OIu4vGVzVBUu8lbsg9ak5FEpho/edit?tab=t.0 

**Запуск программы и функционал:**
- при запуске программы через конфигурацию или из командной строки можно передавать параметры.
- если переданы 2 параметра при запуске программы, то ввод параметров в runtime не производится.
- если при запуске программы не переданы параметры, или передано не 2 параметра, то программа запросит у пользователя ввод 2 параметров в консоли.
- программа определяет, является ли первый параметр целым числом.
- если первым параметром передано целое число, то программа идет по заданию №1, сравнивая переданные числа и производя арифметические операции.
- если первым параметром передано не целое число, то программа идет по заданию №2, сравнивая строки
- если параметры не переданы, то программа идет по заданию №3.

В программе есть ряд проверок, отлавливающих некоторые краевые сценарии, например, не передан второй параметр для задания №1, деление на 0, не передана вторая строка для сравнения.

Не все краевые сценарии были покрыты, так как такое требование не было указано в ТЗ, например, нет проверки разных типов данных в задании №1 и №2 (например сравнение и арифметические операции числа со строкой).
