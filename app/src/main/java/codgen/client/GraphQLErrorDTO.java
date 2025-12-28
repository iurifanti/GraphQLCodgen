/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codgen.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphQLErrorDTO {

    public String message;
    public List<Location> locations;
    public List<Object> path;
    public Map<String, Object> extensions;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Location {

        public int line;
        public int column;
    }

    @Override
    public String toString() {
        return "GraphQLErrorDTO{message='" + message + "', path=" + path + ", extensions=" + extensions + "}";
    }
}
