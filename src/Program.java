public class Program {
    public static void main(String[] args) {
////        MyArrayStack<Character>stack = new MyArrayStack<>();
////        stack.push('a');
////        stack.push('c');
////        stack.push('d');
////        stack.push('x');
////        System.out.println(stack.size());
////        System.out.println(stack.isEmpty());
////        System.out.println(stack.peek());
////        System.out.println(stack.pop());
////        System.out.println(stack.peek());
////        System.out.println(stack);
//
//        Expression expres = new Expression("(a + 4)*[(b - 7)/{a - 5*(c + 8)}]");
//
//        System.out.println(expres.chekBrackets());

//        MyArrayQueue<Character> queue = new MyArrayQueue<>();
//        queue.enqueue('a');
//        queue.enqueue('b');
//        queue.enqueue('c');
//        queue.enqueue('d');
//        queue.enqueue('e');
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.peekFront());
//        queue.dequeue();
//        System.out.println(queue.peekFront());
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.size());
//        queue.dequeue();
//        queue.enqueue('f');
//        queue.enqueue('g');
//        queue.enqueue('h');
//        System.out.println(queue);

        MyArrayDeque<Character> deque = new MyArrayDeque<>();
        deque.insertLeft('e');
        deque.insertLeft('y');
        deque.insertLeft('c');
        deque.insertLeft('d');
        deque.insertRight('s');
        deque.insertRight('f');
        deque.insertRight('g');
        deque.insertRight('h');
        System.out.println(deque);
        deque.removeLeft();
        deque.removeLeft();
        deque.removeRight();
        System.out.println(deque);
        deque.removeRight();
        deque.removeRight();
        System.out.println(deque);


    }
}