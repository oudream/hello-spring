package hello.spring.boot.config1;

import hello.spring.boot.config1.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class Config1ApplicationTests {

//	public Config1ApplicationTests(Person person1) {
//		person = person1;
//		System.out.println('a');
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//
//	public Person getPerson() {
//		return person;
//	}

	@Autowired
	Person person;


//	@Bean

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
