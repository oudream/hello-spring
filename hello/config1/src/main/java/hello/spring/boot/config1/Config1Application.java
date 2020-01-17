package hello.spring.boot.config1;

import hello.spring.boot.config1.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	RunnableDemo( String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}

	public void run() {
		System.out.println("Running " +  threadName );
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// 让线程睡眠一会
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}
}

//@ImportResource(locations = {"classpath:beans.xml"})
//@Component
@SpringBootApplication
public class Config1Application {

//	private Person person;
//
//	@Autowired
//	public void setPerson(Person ps){
//		person = ps;
//	}
//	@Autowired
//	Person person;

	public static void main(String[] args) {
//		SpringApplication.run(Config1Application.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(Config1Application.class, args);
		System.out.println("Had exited!!!");
		Person person = context.getBean(Person.class);
		System.out.println(person);


//
//		RunnableDemo R1 = new RunnableDemo( "Thread-1");
//		R1.start();
//
//		RunnableDemo R2 = new RunnableDemo( "Thread-2");
//		R2.start();
//
//		// 启动定时器线程，并在10000毫秒后执行TimerTask实例的run方法
//		new Timer().schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//				System.out.println("bombing!");
////				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
////				Config1Application p = context.getBean(Config1Application.class);
////				System.out.println(p.person);
////				Config1Application app = new Config1Application();
////				System.out.println(context.getBeansOfType(Person.class));
//			}
//		}, 1000, 2000);
	}

}
