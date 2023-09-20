## Задача 1.
Работа с Map
Доработать класс LanguageCard таким образом, чтобы в нем была еще одна Map, в которой бы хранились теже ключи, что и в 
основной мапе `wordMap`, а в качестве значения - полчество неправильных ответов при практике конкретной пары.
Добавьте метод practiceDifficultWord(), в котором будут представлены только ошибочные слова. 


### wordMap
| Ключ (Слово на английском) | Значение (Перевод) |
|----------------------------|--------------------|
| hello                      | привет             |
| book                       | книга              |
| tree                       | дерево             |


### mistakeCountMap
| Ключ (Слово на английском) | Значение (Количество ошибок) |
|----------------------------|------------------------------|
| hello                      | 2                            |
| book                       | 5                            |
| tree                       | 0                            |