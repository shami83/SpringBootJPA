package com.example.person;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHobby is a Querydsl query type for Hobby
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHobby extends EntityPathBase<Hobby> {

    private static final long serialVersionUID = -253362646L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHobby hobby = new QHobby("hobby");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QPerson person;

    public QHobby(String variable) {
        this(Hobby.class, forVariable(variable), INITS);
    }

    public QHobby(Path<? extends Hobby> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHobby(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHobby(PathMetadata metadata, PathInits inits) {
        this(Hobby.class, metadata, inits);
    }

    public QHobby(Class<? extends Hobby> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.person = inits.isInitialized("person") ? new QPerson(forProperty("person")) : null;
    }

}

