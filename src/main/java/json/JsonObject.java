package json;

import java.util.HashMap;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private HashMap pairs;
    private final int length;
    public JsonObject(JsonPair... jsonPairs) {
        // ToDo
        pairs = new HashMap();
        length = jsonPairs.length;
        for (int i = 0; i < length; i++) {
            pairs.put(jsonPairs[i].key, jsonPairs[i].value);
        }
    }



    @Override
    public String toJson() {
        // ToDo
        StringBuilder toReturn = new StringBuilder();
        toReturn.append("{");
        int counter = 0;
        for (Object key: pairs.keySet()){
            toReturn.append(key.toString());
            toReturn.append(": ");
            toReturn.append(((Json) pairs.get(key)).toJson());
            counter++;
            if (counter != pairs.keySet().size()){
                toReturn.append(", ");
            };


        }
        toReturn.append("}");
        return toReturn.toString();
    }

    public void add(JsonPair jsonPair) {
        // ToDo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
