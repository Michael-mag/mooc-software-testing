package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy word;

    @BeforeEach
    public void obj(){
        this.word = new GHappy();
    }

    @ParameterizedTest(name = "str={0},result={1}")
    @CsvSource({"g,false","gg,true","ggg,true","gx,false","ggx,true","gggx,true"})
    public void BeignsWithAg(String str, Boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result,ans);
    }

    @ParameterizedTest(name = "str={0},result={1}")
    @CsvSource({"gxg,false","g,false","ggxg,false","gggxxxxgxxxg,false"})
    public void EndsWithAg(String str, boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result,ans);
    }

    @ParameterizedTest(name="str={0},result={1}")
    @CsvSource({"calhdggkj,true","sgsjdgggskj,false","kjsaggglks,true","akjasgklas,false"})
    public void RandomlyPlacedG(String str, Boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result, ans);
    }

}
