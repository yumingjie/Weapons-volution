import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

/**
 * Created by yumingjie on 15-2-5.
 */
public class DoublesRallyTest {
    @Test
    public void main() {

        People zhangSan = new People("张三", 100, 10);//张三对象
        People liSi = new People("李四", 100, 10);//李四对象

        People p = mock(People.class);
        given(p.getName()).willReturn("aa");

        


        PrintStream out = mock(PrintStream.class);

       // inOrder().verify(out).print("aa");
        //创建人对象

        Rally rally = new Rally(zhangSan,liSi);
        //assertThat(rally.ouda()).isEqualTo("李四死亡");
    }
}