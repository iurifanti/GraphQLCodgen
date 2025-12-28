package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the P_Paziente___updateBulk mutation on objects of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliP_PazienteBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliP_PazienteDTO> items;
    private int totalCount;

    public CliP_PazienteBulkResultDTO() {
    }


    /**
     * An array of objects of class P_Paziente affected by the mutation.
     */
    public java.util.List<CliP_PazienteDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class P_Paziente affected by the mutation.
     */
    public void setItems(java.util.List<CliP_PazienteDTO> items) {
        this.items = items;
    }

    /**
     * The total count of objects affected by the mutation,
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of objects affected by the mutation,
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (items != null) {
            joiner.add("items: " + GraphQLRequestSerializer.getEntry(items));
        }
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        return joiner.toString();
    }

    public static CliP_PazienteBulkResultDTO.Builder builder() {
        return new CliP_PazienteBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private java.util.List<CliP_PazienteDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class P_Paziente affected by the mutation.
         */
        public Builder setItems(java.util.List<CliP_PazienteDTO> items) {
            this.items = items;
            return this;
        }

        /**
         * The total count of objects affected by the mutation,
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public CliP_PazienteBulkResultDTO build() {
            CliP_PazienteBulkResultDTO result = new CliP_PazienteBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
