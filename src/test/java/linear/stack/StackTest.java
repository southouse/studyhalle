package linear.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * Created by southouse
 * Created on 2/23/2021.
 **/

class StackTest {

    @Test
    @DisplayName("스택에 데이터를 삽입(푸시)한다.")
    void push() {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.push(60);
        });
    }

    @Test
    @DisplayName("스택에 데이터를 삭제(팝)한다.")
    void pop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.pop();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.pop();
        });
    }
}
