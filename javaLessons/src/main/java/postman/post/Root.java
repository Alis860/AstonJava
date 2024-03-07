package postman.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
public class Root {

   private Map<String, Object> args;
   private Data data;
   private Map<String, Object> files;
   private Map<String, Object> form;
   private Headers headers;
   private Object json;
   private String url;

   @lombok.Data
   static class Data{
      private String test;
   }
}
