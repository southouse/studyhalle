package linear.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by southouse
 * Created on 2/23/2021.
 **/
class ListNodeStackTest {

    @Test
    @DisplayName("노드 스택에 데이터를 삽입(push)한다.")
    void push() {
        ListNodeStack listNodeStack = new ListNodeStack(5);
        listNodeStack.push(10);
        listNodeStack.push(20);
        listNodeStack.push(30);
        listNodeStack.push(40);
        listNodeStack.push(50);
        System.out.println(listNodeStack);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            listNodeStack.push(60);
        });
    }

    @Test
    @DisplayName("노드 스택에 데이터를 삭제(pop)한다.")
    void pop() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(10);
        listNodeStack.push(20);
        listNodeStack.push(30);
        System.out.println(listNodeStack);
        listNodeStack.pop();
        listNodeStack.pop();
        System.out.println(listNodeStack);
        listNodeStack.pop();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           listNodeStack.pop();
        });
    }

}