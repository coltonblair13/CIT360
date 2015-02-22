

/*JSON Syntax Rules

1. Data is in name/value pairs
2. Data is seperated by commas
3. Curly braces hold objects
4. Square brackets hold arrays

JSON Data is written as name/value pairs.
A name/value pair consists of a field name in double quotes followed by a colon followed by a value. 

*/

"firstName":"John"

/* JSON values are typical values and can be a number, a string, a boolean, an array, an object, or Null. 

JSON object are written inside curly braces. 

*/

{"firstName":"John", "lastName":"Doe"}

/* JSON Arrays are written inside square brackets*/

"employees":[
    {"firstName":"John", "lastName":"Doe"}, 
    {"firstName":"Anna", "lastName":"Smith"}, 
    {"firstName":"Peter","lastName":"Jones"}
]


/* The following shows the use of JSON inside JAVA code and how to decode it. 
This example makes use of the JSON Object and the JSONArray where the JSONObject is a map and JSON array is a list so that you could
access them with standard operations of Map or List.*/

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

class JsonDecodeDemo 
{
   public static void main(String[] args) 
   {
      JSONParser parser=new JSONParser();
      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
      try{
         Object obj = parser.parse(s);
         JSONArray array = (JSONArray)obj;
         System.out.println("The 2nd element of array");
         System.out.println(array.get(1));
         System.out.println();

         JSONObject obj2 = (JSONObject)array.get(1);
         System.out.println("Field \"1\"");
         System.out.println(obj2.get("1"));    

         s = "{}";
         obj = parser.parse(s);
         System.out.println(obj);

         s= "[5,]";
         obj = parser.parse(s);
         System.out.println(obj);

         s= "[5,,2]";
         obj = parser.parse(s);
         System.out.println(obj);
      }catch(ParseException pe){
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
}