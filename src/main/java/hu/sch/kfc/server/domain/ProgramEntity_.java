package hu.sch.kfc.server.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2010-09-03T13:56:57.821+0200")
@StaticMetamodel(ProgramEntity.class)
public class ProgramEntity_ {
	public static volatile SingularAttribute<ProgramEntity, Long> id;
	public static volatile SingularAttribute<ProgramEntity, String> name;
	public static volatile SingularAttribute<ProgramEntity, String> description;
	public static volatile SingularAttribute<ProgramEntity, GroupEntity> organizer;
	public static volatile SingularAttribute<ProgramEntity, Date> start;
	public static volatile SingularAttribute<ProgramEntity, Date> end;
	public static volatile SingularAttribute<ProgramEntity, Date> orderStart;
	public static volatile SingularAttribute<ProgramEntity, Date> orderEnd;
}
