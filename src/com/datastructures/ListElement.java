package com.datastructures;

public class ListElement {
    ListElement next; //указатель на следующий элемент
    int data; //данные
}

class List{
    private ListElement head;
    private ListElement tail;

    public void addFront(int data){ // добавить элемент в начало списка
        ListElement listElement = new ListElement(); //Создаем новый элемент
        listElement.data = data; //инициализируем данные

        if(head == null){ //если список пуст
            head = listElement; //указываем ссылки начала и конца на новый элемент
            tail = listElement; //т.е. список теперь состоит из одного элемента
        } else {
            listElement.next = head; //иначе "старый" последний элемент теперь ссылается на новый
            head = listElement; //а в указаетль на последний элемент записываем адрес новаго элемента
        }
    }

    public void addBack(int data){
        ListElement listElement = new ListElement();
        listElement.data = data;
        if(tail == null){
            head = listElement;
            tail = listElement;
        } else {
            tail.next = listElement;
            tail = listElement;
        }
    }

    public void printList(){
        ListElement t = head; //получаем ссылка на первый элемент
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public void deleteElement(int data){
        if(head == null){ //Если список пусть, то ничего не делаем
            return;
        }

        if(head == tail){ //Если список состоит из одного элемента
            head = null; //очищаем указатели начала и конца
            tail = null;
            return;
        }

        if(head.data == data){ //если первый элемент - тот, что нам нужен
            head = head.next;  //переключаем указатель начала на второй элемент
            return;
        }

        ListElement t = head;  //Иначе начинаем искать
        while(t.next != null){ //пока следующий элемент существует
            if(t.next.data == data){ //проверяем седующий элемент
                if(tail == t.next){  //если он последний
                    tail = t;        //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next; //найденный элемент выкидываем
                return; //выходим
            }
            t = t.next; //иначе ищем дальше
        }
    }
}
