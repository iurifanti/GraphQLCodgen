package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Episodio_MPOX
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Episodio_MPOXResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Episodio_MPOXResponseProjection() {
    }

    public Episodio_MPOXResponseProjection(Episodio_MPOXResponseProjection projection) {
        super(projection);
    }

    public Episodio_MPOXResponseProjection(List<Episodio_MPOXResponseProjection> projections) {
        super(projections);
    }

    public Episodio_MPOXResponseProjection all$() {
        return all$(3);
    }

    public Episodio_MPOXResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altra_terapia();
        this.data();
        this.ricoverato();
        this.terapia();
        this.tipo_terapia();
        if (projectionDepthOnFields.getOrDefault("Episodio_MPOXResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Episodio_MPOXResponseProjection.Visita_mpvResponseProjection.visita_mpv_", projectionDepthOnFields.getOrDefault("Episodio_MPOXResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0) + 1);
            this.visita_mpv_(new Visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Episodio_MPOXResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0)));
        }
        this.typename();
        return this;
    }

    public Episodio_MPOXResponseProjection _clientId() {
        return _clientId(null);
    }

    public Episodio_MPOXResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection _id() {
        return _id(null);
    }

    public Episodio_MPOXResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection altra_terapia() {
        return altra_terapia(null);
    }

    public Episodio_MPOXResponseProjection altra_terapia(String alias) {
        add$(new GraphQLResponseField("altra_terapia").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection data() {
        return data(null);
    }

    public Episodio_MPOXResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection ricoverato() {
        return ricoverato(null);
    }

    public Episodio_MPOXResponseProjection ricoverato(String alias) {
        add$(new GraphQLResponseField("ricoverato").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection terapia() {
        return terapia(null);
    }

    public Episodio_MPOXResponseProjection terapia(String alias) {
        add$(new GraphQLResponseField("terapia").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection tipo_terapia() {
        return tipo_terapia(null);
    }

    public Episodio_MPOXResponseProjection tipo_terapia(String alias) {
        add$(new GraphQLResponseField("tipo_terapia").alias(alias));
        return this;
    }

    public Episodio_MPOXResponseProjection visita_mpv_(Visita_mpvResponseProjection subProjection) {
        return visita_mpv_(null, subProjection);
    }

    public Episodio_MPOXResponseProjection visita_mpv_(String alias, Visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("visita_mpv_").alias(alias).projection(subProjection));
        return this;
    }

    public Episodio_MPOXResponseProjection typename() {
        return typename(null);
    }

    public Episodio_MPOXResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Episodio_MPOXResponseProjection deepCopy$() {
        return new Episodio_MPOXResponseProjection(this);
    }


}
