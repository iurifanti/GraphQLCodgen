package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Modalita_somministrazione___updateBulk mutation on objects of class Modalita_somministrazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliModalita_somministrazioneBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliModalita_somministrazioneDTO> items;
    private int totalCount;

    public CliModalita_somministrazioneBulkResultDTO() {
    }


    /**
     * An array of objects of class Modalita_somministrazione affected by the mutation.
     */
    public java.util.List<CliModalita_somministrazioneDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Modalita_somministrazione affected by the mutation.
     */
    public void setItems(java.util.List<CliModalita_somministrazioneDTO> items) {
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

    public static CliModalita_somministrazioneBulkResultDTO.Builder builder() {
        return new CliModalita_somministrazioneBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliModalita_somministrazioneDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Modalita_somministrazione affected by the mutation.
         */
        public Builder setItems(java.util.List<CliModalita_somministrazioneDTO> items) {
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


        public CliModalita_somministrazioneBulkResultDTO build() {
            CliModalita_somministrazioneBulkResultDTO result = new CliModalita_somministrazioneBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
