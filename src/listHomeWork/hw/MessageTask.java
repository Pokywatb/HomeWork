package listHomeWork.hw;

import java.util.List;

import static listHomeWork.hw.MessagePriority.MEDIUM;


public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int i = 0;
       for (MessagePriority mp : MessagePriority.values()){
           i = 0;
           for (Message m : messageList){
               if (m.getPriority().equals(mp)){
                   i++;
               }

           }
           System.out.println(i +" " + "сообщений" + " " + mp);
       }

    }


    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        for (int i = 0; i <= 10; i++) {
            int j = 0;
            for  (Message m : messageList){
                if (m.getCode() == i){
                    j++;

                }
            }
            System.out.println(j + " " + "сообщений с кодом" + " " + i);

        }
    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        int a = messageList.size();

        for (int i = 0; i < messageList.size() ; i++) {

            for (int j = i+1 ; j < messageList.size() ; j++) {
                if((messageList.get(i).getCode() == messageList.get(j).getCode()) && (messageList.get(i).getPriority() == messageList.get(j).getPriority())){
                    a--;
                    break;
                }
            }
        }
        System.out.println(a + " " + "Уникальных сообщений");
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        int a = messageList.size();

        for (int i = 0; i < messageList.size() ; i++) {

            for (int j = i+1 ; j < messageList.size() ; j++) {
                if((messageList.get(i).getCode() == messageList.get(j).getCode()) && (messageList.get(i).getPriority() == messageList.get(j).getPriority())){
                    messageList.remove(j);
                    break;

                }

            }
        }

        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        for (int i = 0; i < messageList.size() ; i++){
            if(messageList.get(i).getPriority().equals(priority)){
                messageList.remove(i);
                i--;
            }
        }
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        for (int i = 0; i < messageList.size() ; i++){
            if(!messageList.get(i).getPriority().equals(priority)){
                messageList.remove(i);
                i--;
            }
        }
    }


    public static void main(String[] args) {
        // вызов методов

        List<Message> messages = MessageGenerator.generate(100);
        System.out.println(messages);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        //uniqueMessagesInOriginalOrder(messages);
        removeOther(messages, MEDIUM);
        System.out.println(messages);

        }

}
