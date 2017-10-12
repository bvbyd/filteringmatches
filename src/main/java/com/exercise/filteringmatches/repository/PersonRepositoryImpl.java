package com.exercise.filteringmatches.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> findPersonsByFilter(FilterDTO filter) {
		Criteria c = entityManager.unwrap(Session.class).createCriteria(Person.class);
		if (filter.getAgeFrom() != null)
			c.add(Property.forName("age").ge(filter.getAgeFrom()));
		if (filter.getAgeTo() != null)
			c.add(Property.forName("age").le(filter.getAgeTo()));

		if (filter.getHeightFrom() != null)
			c.add(Property.forName("heightInCm").ge(filter.getHeightFrom()));
		if (filter.getHeightTo() != null)
			c.add(Property.forName("heightInCm").le(filter.getHeightTo()));

		if (filter.getCompatibilityFrom() != null)
			c.add(Property.forName("compatibilityScore").ge(filter.getCompatibilityFrom() / 100f));
		if (filter.getCompatibilityTo() != null)
			c.add(Property.forName("compatibilityScore").le(filter.getCompatibilityTo() / 100f));

		if (filter.getHasPhoto() != null)
			c.add(filter.getHasPhoto() ? Property.forName("mainPhoto").isNotNull()
					: Property.forName("mainPhoto").isNull());

		if (filter.getFavourite() != null)
			c.add(Property.forName("favourite").eq(filter.getFavourite()));

		if (filter.getInContact() != null)
			c.add(filter.getInContact() ? Property.forName("contactsExchanged").gt(0)
					: Property.forName("contactsExchanged").eq(0));

		c.add(Property.forName("id").ne(filter.getPerson().getId()));

		if (filter.getDistance() != null) {
			c.createCriteria("city").add(Restrictions.sqlRestriction("2 * 3961 * asin(sqrt(power((sin(radians((lat - "
					+ filter.getPerson().getCity().getLat() + ")/ 2))), 2) + cos(radians("
					+ filter.getPerson().getCity().getLat() + ")) * cos(radians(lat)) *power((sin(radians((lon - "
					+ filter.getPerson().getCity().getLon() + ") / 2))), 2))) < " + filter.getDistance()));
		}
		return c.list();

	}

}
