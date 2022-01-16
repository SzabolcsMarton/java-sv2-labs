package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResultTest() {
        Vote vote = new Vote();
        Map<String , VoteResult> test = new HashMap<>();
        test.put("a",VoteResult.YES);
        test.put("b",VoteResult.NO);
        test.put("c",VoteResult.ABSTAIN);
        test.put("d",VoteResult.ABSTAIN);
        test.put("e",VoteResult.YES);
        test.put("f",VoteResult.YES);
        test.put("g",VoteResult.NO);
        test.put("h",VoteResult.NO);
        test.put("i",VoteResult.YES);

        Map<VoteResult,Integer> testResult = vote.getResult(test);

        assertEquals(4,testResult.get(VoteResult.YES));
        assertEquals(3,testResult.get(VoteResult.NO));
        assertEquals(2,testResult.get(VoteResult.ABSTAIN));

    }
}