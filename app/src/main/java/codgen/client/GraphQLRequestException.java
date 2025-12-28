/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codgen.client;

import java.util.List;

public class GraphQLRequestException extends RuntimeException {

    private final List<GraphQLErrorDTO> errors;

    public GraphQLRequestException(List<GraphQLErrorDTO> errors) {
        super(buildMessage(errors));
        this.errors = errors;
    }

    public List<GraphQLErrorDTO> getErrors() {
        return errors;
    }

    private static String buildMessage(List<GraphQLErrorDTO> errors) {
        StringBuilder sb = new StringBuilder("GraphQL errors:");
        for (GraphQLErrorDTO e : errors) {
            sb.append("\n- ").append(e.message);
            if (e.path != null) {
                sb.append(" path=").append(e.path);
            }
        }
        return sb.toString();
    }
}
