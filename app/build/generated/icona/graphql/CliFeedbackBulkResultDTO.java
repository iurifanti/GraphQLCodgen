package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Feedback___updateBulk mutation on objects of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFeedbackBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliFeedbackDTO> items;
    private int totalCount;

    public CliFeedbackBulkResultDTO() {
    }


    /**
     * An array of objects of class Feedback affected by the mutation.
     */
    public java.util.List<CliFeedbackDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Feedback affected by the mutation.
     */
    public void setItems(java.util.List<CliFeedbackDTO> items) {
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

    public static CliFeedbackBulkResultDTO.Builder builder() {
        return new CliFeedbackBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliFeedbackDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Feedback affected by the mutation.
         */
        public Builder setItems(java.util.List<CliFeedbackDTO> items) {
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


        public CliFeedbackBulkResultDTO build() {
            CliFeedbackBulkResultDTO result = new CliFeedbackBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
