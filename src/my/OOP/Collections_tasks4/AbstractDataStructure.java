//
package my.OOP.Collections_tasks4;

public abstract class AbstractDataStructure implements DataStructure {

    protected int size; //Колличество реально сущ. элементов
                        //(индекс, куда добовлять след. элемент)

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
         return size ==0;
         //Если size == 0 -> try -> структура пуста
    }
}
//Создаем реальный класс