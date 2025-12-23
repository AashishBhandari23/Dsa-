// // // package Stack;

// // import java.util.Scanner;

// // public class stackOperation {

// //     static final int MAX = 100;//Maximum size of stack
// //     static int top = -1;//Initial index of stack
// //     static int[] stack = new int[MAX]; // Array Initilization

// //     static boolean isEmpty() {
// //         return top < 0;
// //     }

// //     static boolean isFull() {
// //         return top >= MAX - 1;
// //     }

// //     static int. pop (){
// //         if(isEmpty()){
// //             System.out,System.err.println();

// //         }
// //     }

// //     //Check the size of stack size
// //     static int stackSize() {
// //         return top + 1;//++ doesnot work
// //     }

// //     // Push Operation
// //     static void push(int element) {
// //         if (isFull()) {
// //             System.out.println("Stack is overFlow");
// //             return;
// //         }
// //         stack[++top] = element;
// //         System.out.println("The pushed element is : " + element);

// //     }


// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         while (true) {
// //             System.out.println("=================Stack Menu=================");
// //             System.out.println("1. Is stack is Empty?");
// //             System.out.println("2. Is stack is Full?");
// //             System.out.println("3. Stack Size");
// //             System.out.println("4. Push Operation");
// //              System.out.println("5. Pop Operation");
// //             System.out.println("5. --------Exit----------");
// //             int choice = sc.nextInt();
// //             switch (choice) {
// //                 case 1 ->
// //                     System.out.println("Stack Empty: " + isEmpty());
// //                 case 2 ->
// //                     System.out.println("Stack Full: " + isFull());
// //                 case 3 ->
// //                     System.out.println("Stack Size: " + stackSize());
// //                 case 4 -> {

// //                     System.out.println("Enter a number: ");
// //                     int element = sc.nextInt();
// //                     push(element);
// //                     break;
// //                 }
// //                 case 5 -> {
// //                     System.out.println("Thank you, Exiting......");
// //                     sc.close();
// //                     return;
// //                 }
// //                 default ->
// //                     System.out.println(".................Invalid Choice!..........");
// //             }
// //         }

// //     }
// // }






// import java.util.Scanner;

// public class stackOperation {

//   static final int MAX = 100; // Maximum size of the stack
//   static int[] stack = new int[MAX];
//   static int top = -1;
//   // Check if the stack is empty
//   static boolean isEmpty(){
//     return top<0;
//   }
//   //Check if the stack is full...
//   static boolean isFull ()
//   {
//      return top>= MAX-1;
//   }
//   //Check the size of the stack..
//   static int stackSize(){
//     return top+1;
//   }
//   // PUSH OPERATION
//   static void pushOperation(int element){
//     if(isFull())
//     {
//      System.out.println("Stack Overflow !! Cannot push the element");
//      return;
//     }
//     stack[++top] = element;
//     System.out.println("The pushed element in the stack is:" +element);
//   }
//   // POP Operation.
//   static void popOperation()
//   {
//     if(isEmpty())
//     {
//         System.out.println("Stack Underflow !! Cannot pop the element");
//         return;
//     }

   
//     int poppedElement = stack[top--];
//      System.out.println("Element gets popped" +poppedElement);
//   }

// // Peek operation
// // Dispaly operation


//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    while(true){
//     System.out.println( "========= STACK MENU ======");
//     System.out.println( "1. Is stack empty");
//     System.out.println( "2. Is stack full");
//     System.out.println( "3. Stack Size");
//     System.out.println("4. Push Operation");
//     System.out.println("5. Pop Operation");
//     System.out.println("6. Exit the program.");
//     int  choice = sc.nextInt();
//     switch(choice)
//     {
//         case 1:
//             System.out.println("Is stack empty" + isEmpty());
//             break;
//         case 2:
//             isFull();
//             break;
//         case 3:
//             System.out.println( "Stack Size" + stackSize());
//             break;
//         case 4:
//             System.out.println("Enter the element you want to push:");
//             int element = sc.nextInt();
//             pushOperation(element);
//             break;
//         case 5:
//             popOperation();
//             break;
//         case 6:
//             System.out.println("Thank you. Exiting....");
//             sc.close();
//             return;
//         default:
//             System.out.println("Invalid choice. Try again");

//     }

//    }
//  }
// }








import java.util.Scanner;

public class stackOperation {

    static final int MAX = 100; // Maximum size of the stack
    static int[] stack = new int[MAX];
    static int top = -1;

    // check if the stack is empty
    static boolean isEmpty() {
        return top < 0;
    }

    // check if the stack is full
    static boolean isFull() {
        return top >= MAX - 1;
    }

    // check the size of the stack
    static int stackSize() {
        return top + 1;
    }

    // peek operation
    static int peek() {
        return stack[top];
    }

    // PUSH OPERATION

    static void push(int element) {
        if (isFull()) {
            System.out.println(("Stack is full"));
            return;
        }

        stack[++top] = element;
        System.out.println("The pushed element in the stack is: " + element);
    }

    // POP Operation
    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int element = stack[top--];
        System.out.println("The popped element in the stack is: " + element);
        return element;
    }

    // DISPLAY operation
    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===Stack MENU===");
            System.out.println("1 is stack empty?");
            System.out.println("2 is stack full?");
            System.out.println("3 stack Size");
            System.out.println("4 PUSH");
            System.out.println("5 POP");
            System.out.println("6 peek");
            System.out.println("7 Display Stack");
            System.out.println("8 Exist");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("is Stack Empty: " + isEmpty());
                    break;

                case 2:
                    System.out.println("is Stack Full: " + isFull());
                    break;

                case 3:
                    System.out.println("Stack Size: " + stackSize());
                    break;

                case 4:
                    System.out.println("Enter the element: ");
                    int element = sc.nextInt();
                    push(element);
                    break;

                case 5:
                    pop();
                    break;

                case 6:
                    System.out.println("The top elemnet is " + peek());
                    break;

                case 7:
                    display();
                    break;

                case 8:
                    System.out.println("Thank you.Existing...");
                    sc.close();
                    return;

                default:
                    System.out.println("invalid choice.Try again");
            }
        }
    }

}

