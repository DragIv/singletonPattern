# Choc-O-Holic
Идея файла Choc-O-Holic показать благоприятные и неблагоприятные решения Singleton паттерна. Файл ChocolateBoiler содержит реализацию singleton и пример ее применения на классе ChocolateBoiler2. ChocolateBoiler еще не является реализацией одиночки, а ChocolateBoiler2 является, т.к. дополнен проверкой существования экземпляра.

Решение проблемы многопоточного доступа и оптимизации показано в папке improvement. Первое решение это conditionalBlocking (условная блокировка), где синхронизация будет выполняться только при первом вызове. Второе решение сreationInAdvance (в классе создаем экземпляр заранее). Так же в папке withEnum представлена реализация singleton и его примера ChocolateBoiler через enum.

# DopHdd
Идея файла DopHdd показать свою реализацию паттерна Singleton на примере жесткого диска(hdd). Я реализовал свой пример через Enum, т.е. при помощи константы со статическим доступом UNIQUE_INSTANCE. Также в классе есть различные методы для жесткого диска(заполнить, удалить и тд.).

В классе Main я создаю экземпляр hdd, после чего заполняю и сохраняю его. Далее создаю экземпляр hdd2 и проверяю сохранена ли информация. Для чего? Если информация сохранена, то одиночка работает корректно, тк не дает создать новый экземпляр класса.
