package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult>resultWithString){
        Map<VoteResult, Integer> resultWithVoteResult = new HashMap<>();
        for (VoteResult actual : resultWithString.values()){
            if(!resultWithVoteResult.containsKey(actual)){
                resultWithVoteResult.put(actual,0);
            }
            resultWithVoteResult.put(actual,resultWithVoteResult.get(actual) + 1);
        }

        return resultWithVoteResult;
    }

}
