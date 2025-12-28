package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Comorbidita_mpv___updateBulk mutation on objects of class Comorbidita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliComorbidita_mpvBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliComorbidita_mpvDTO> items;
    private int totalCount;

    public CliComorbidita_mpvBulkResultDTO() {
    }


    /**
     * An array of objects of class Comorbidita_mpv affected by the mutation.
     */
    public java.util.List<CliComorbidita_mpvDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Comorbidita_mpv affected by the mutation.
     */
    public void setItems(java.util.List<CliComorbidita_mpvDTO> items) {
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

    public static CliComorbidita_mpvBulkResultDTO.Builder builder() {
        return new CliComorbidita_mpvBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private java.util.List<CliComorbidita_mpvDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Comorbidita_mpv affected by the mutation.
         */
        public Builder setItems(java.util.List<CliComorbidita_mpvDTO> items) {
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


        public CliComorbidita_mpvBulkResultDTO build() {
            CliComorbidita_mpvBulkResultDTO result = new CliComorbidita_mpvBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
