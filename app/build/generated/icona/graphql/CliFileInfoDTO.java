package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFileInfoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String fileId;
    @javax.validation.constraints.NotNull
    private String mimeType;
    @javax.validation.constraints.NotNull
    private String name;
    private int size;
    @javax.validation.constraints.NotNull
    private String uploadedOn;
    @javax.validation.constraints.NotNull
    private String link;

    public CliFileInfoDTO() {
    }


    public String getFileId() {
        return fileId;
    }
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getMimeType() {
        return mimeType;
    }
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getUploadedOn() {
        return uploadedOn;
    }
    public void setUploadedOn(String uploadedOn) {
        this.uploadedOn = uploadedOn;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fileId != null) {
            joiner.add("fileId: " + GraphQLRequestSerializer.getEntry(fileId));
        }
        if (mimeType != null) {
            joiner.add("mimeType: " + GraphQLRequestSerializer.getEntry(mimeType));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        if (uploadedOn != null) {
            joiner.add("uploadedOn: " + GraphQLRequestSerializer.getEntry(uploadedOn));
        }
        if (link != null) {
            joiner.add("link: " + GraphQLRequestSerializer.getEntry(link));
        }
        return joiner.toString();
    }

    public static CliFileInfoDTO.Builder builder() {
        return new CliFileInfoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String fileId;
        private String mimeType;
        private String name;
        private int size;
        private String uploadedOn;
        private String link;

        public Builder() {
        }

        public Builder setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setUploadedOn(String uploadedOn) {
            this.uploadedOn = uploadedOn;
            return this;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }


        public CliFileInfoDTO build() {
            CliFileInfoDTO result = new CliFileInfoDTO();
            result.setFileId(this.fileId);
            result.setMimeType(this.mimeType);
            result.setName(this.name);
            result.setSize(this.size);
            result.setUploadedOn(this.uploadedOn);
            result.setLink(this.link);
            return result;
        }

    }
}
