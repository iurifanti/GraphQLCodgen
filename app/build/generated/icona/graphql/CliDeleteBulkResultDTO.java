package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the delete bulk mutation.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliDeleteBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int deleted;

    public CliDeleteBulkResultDTO() {
    }


    /**
     * The total count of objects returned by the page options that has been deleted.
     */
    public int getDeleted() {
        return deleted;
    }
    /**
     * The total count of objects returned by the page options that has been deleted.
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("deleted: " + GraphQLRequestSerializer.getEntry(deleted));
        return joiner.toString();
    }

    public static CliDeleteBulkResultDTO.Builder builder() {
        return new CliDeleteBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private int deleted;

        public Builder() {
        }

        /**
         * The total count of objects returned by the page options that has been deleted.
         */
        public Builder setDeleted(int deleted) {
            this.deleted = deleted;
            return this;
        }


        public CliDeleteBulkResultDTO build() {
            CliDeleteBulkResultDTO result = new CliDeleteBulkResultDTO();
            result.setDeleted(this.deleted);
            return result;
        }

    }
}
