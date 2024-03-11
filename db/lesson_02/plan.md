1. Задачи курса и что вы будете уметь после курса:

**Задачи курса:**
- понимание роли и функций - зачем нужны СУБД, для чего они используются?
- умение использовать - как и какими способами создавать и подключаться?
- основы языка sql-запросов - как получать нужную информацию (выборки) из базы данных?
- практические навыки использования в проектах.

**Умения после курса:**
- установка необходимого ПО, создание и подключение к СУБД;
- моделирование, проектирование таблиц и связей;
- формирование sql-запросов.

2. Клиент-серверная архитектура и место СУБД в ней.

3. Основные функции СУБД.

4. Концепция CRUD и агрегация данных.

5. SQL запросы - практика.

Наш "полигон" на сегодня: 

[Песочница (интернет-магазин)](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all)

**Примеры и задания:**

```sql
-- вывести всех клиентов

```

```sql
-- вывести страны клиентов (только уникальные значения - без дублей)

```

**Задача. Вывести данные о поставщиках**

(проекция: `название_компании`, `страна`)

```sql

```

## Фильтрация в SQL / Оператор `WHERE`

**Пример. Вывести клиентов из `Germany`**

```sql

```

**Задача. Вывести город и почтовый индекс клиентов из `France`**

```sql

```

## Операторы сравнения

- `=` равно
- `!=` `<>` не равно
- `>`больше
- `<`меньше
- `>=` больше или равно
- `<=` меньше или равно

## Логические операторы (приоритет - сверху вниз)

- `NOT` логическое отрицание (унарный)
- `AND` логическое И (бинарный)
- `OR` логическое ИЛИ (бинарный)

**Пример. Вывести клиентов из `Germany` (`Berlin`)**

```sql

```

**Пример. Вывести клиентов не из `Germany`**

```sql

```

**Задача. Вывести товары с ценой от `50` до `100` EUR**

```sql

```

**Задача. Вывести клиентов из `Germany` и `France`**

```sql

```

**Задача. Вывести клиентов, кроме тех, что из `UK` и `USA`**

```sql

```

**Задача. Вывести номера телефонов поставщиков из `UK` и `Brazil`**

```sql

```

## Оператор `IN`

- проверка принадлежности к списку значений

```sql

```

```sql

```

**Задача. Вывести название и стоимость товаров из категорий `1` и `3` со стоимостью до `50` EUR**

```sql

```

**Задачи. Вывести товары с ценой от `80` до `190` EUR не из категории `5`**

```sql

```

## Оператор диапазона `BETWEEN`

**Пример**

```sql

```

**Задача. Вывести товары с ценой от `10` до `50` EUR из категорий `1, 2, 3`**

```sql

```

## Сортировка в SQL / Оператор `ORDER BY`

**Пример**

```sql

```

**Задача. Вывести товары из `5` категории по возрастанию цены**

```sql

```

## Лимитирование вывода / Оператор `LIMIT`

- Как правило, применяется для:
    - постраничного (порционного) вывода (напр., товаров в каталоге)
    - вывода блока рекомендаций

**Пример. Вывести три самых дорогих товара**

```sql

```

```sql
-- пример формулы смещения (OFFSET)

```

**Задача. Вывести название и стоимость одного самого дорогого товара из категории `1`**

```sql

```

**Задача. Вывести товар, который находится на третьем месте среди самых дорогих**

```sql

```

## Псевдонимы в SQL / Оператор `AS`

**Примеры**

```sql
SELECT
		ProductName,
    Price AS Price_eur,
    Price * 1.05 AS Price_usd
FROM Products
```

```sql
SELECT *,
	Price * 1.05 AS Price_usd
FROM Products
```

```sql
SELECT *,
	Price * .95 AS Price_down
FROM Products
```

**Задача. Вывести названия товаров, а также их стоимость:**

- полную
- со скидкой в '25%'
- с наценкой в `15%`

```sql

```

**Пример оформления Д/З**

```sql
-- файл homework.sql
--
-- Задача 1. Вывести ...
SELECT ...

-- Задача 2. Вывести ...
SELECT ...
```