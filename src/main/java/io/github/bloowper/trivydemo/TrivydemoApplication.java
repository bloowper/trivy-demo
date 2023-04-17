package io.github.bloowper.trivydemo;

import com.google.common.collect.Comparators;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TrivydemoApplication {

	public static void main(String[] args) {
		List<Integer> integers = List.of(3, 4, 5);
		Comparators.isInOrder(integers, Integer::compareTo);
		SpringApplication.run(TrivydemoApplication.class, args);
	}

}
