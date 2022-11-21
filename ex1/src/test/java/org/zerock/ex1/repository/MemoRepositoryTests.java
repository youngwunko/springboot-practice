package org.zerock.ex1.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.ex1.entity.Memo;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    private MemoRepository memoRepository;

    @Test
    public void testInsertDummies(){
        Sort sort1 = Sort.by("mno").descending();
        // Pageable pageable = PageRequest.of(1, 10, sort1);
        //Page<Memo> result = memoRepository.findAll(pageable);

        IntStream.rangeClosed(0, 9).forEach(i -> {
            Pageable pageable = PageRequest.of(i, 10, sort1);
            Page<Memo> result = memoRepository.findAll(pageable);
            result.get().forEach(memo -> System.out.println(memo));
        });

    }

}
