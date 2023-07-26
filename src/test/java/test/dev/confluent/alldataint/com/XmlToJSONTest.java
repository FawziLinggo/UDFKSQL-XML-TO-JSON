package test.dev.confluent.alldataint.com;

import dev.confluent.alldataint.com.XmlToJSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Assert;
import org.junit.Test;

public class XmlToJSONTest {
    private static final Logger logger = LogManager.getLogger(XmlToJSONTest.class);
     @Test
    public void testConvertXMLtoJSONOnly() {
        // Data XML yang akan diuji
        String xmlData = "<college><student><id>101</id><name>abc</name><branch>CS</branch></student><student><id>102</id><name>xyz</name><branch>IT</branch></student></college>";

        String expectedJson = "{\"college\":{\"student\":[{\"name\":\"abc\",\"id\":101,\"branch\":\"CS\"},{\"name\":\"xyz\",\"id\":102,\"branch\":\"IT\"}]}}";
        JSONObject result = XML.toJSONObject(xmlData);

        logger.info("XML: " + xmlData + " JSON: " + result.toString());

         Assert.assertEquals(expectedJson, result.toString());

    }
}
