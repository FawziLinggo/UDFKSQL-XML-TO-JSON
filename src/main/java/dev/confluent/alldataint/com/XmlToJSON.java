package dev.confluent.alldataint.com;

import dev.confluent.alldataint.com.model.CostumResult;
import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;
import org.json.JSONObject;
import org.json.XML;
@UdfDescription(name = "XmlToJSON",
        author = "All Data International (https://alldataint.com/)",
        version = "0.0.2",
        description = "Converts XML to JSON")
public class XmlToJSON {
//    @Udf(description = "Converts XML to JSON With Error Handling")
//    public CostumResult convertXMLtoJSONWithErr(@UdfParameter String xml) {
//        CostumResult result = new CostumResult();
//        try {
//            result.setResult(new JSONObject(XML.toJSONObject(xml)).toString());
//            result.setError_message(null);
//        } catch (Exception e) {
//            result.setResult(null);
//            result.setError_message("Error: Failed to convert XML to JSON. " + e.getMessage());
//        }
//        return result;
//    }

    @Udf(description = "Converts XML to JSON Without Error Handling")
    public String convertXMLtoJSONOnly(@UdfParameter("xml") String xml) {
        JSONObject result = XML.toJSONObject(xml);
        System.out.println("XML: " + xml + " JSON: " + result.toString());
        return result.toString();
    }
//
//    @Udf(description = "Converts XML to JSON Object")
//    public JSONObject convertXMLtoJSONObject(@UdfParameter String xml) {
//        return XML.toJSONObject(xml);
//    }
}