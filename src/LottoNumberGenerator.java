import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
     .'`'.'`'.
 .''.`.  :  .`.''.
 '.    '. .'    .'
 .```  .' '.  ```.
 '..',`  :  `,'..'
      `-'`'-`))
             ((luck
              \| 
*/
public class LottoNumberGenerator {
	
	public static void main(String[] args) {
		
		Integer lottoTicketsAmount = 3;
		Integer numbersAmountOnEachTicket = 6;
		
		List<Integer> numbersSample = Arrays.asList(11, 7, 21, 30, 29, 40, 50, 42, 54, 58, 1, 13, 28, 37, 42, 60, 9, 15, 23, 30, 38, 57);
		
		Set<Integer> nonRepeatingNumbersSample = new HashSet<>(numbersSample);
		List<Integer> betNumbersSuggestion = new ArrayList<>(nonRepeatingNumbersSample);
		
		System.out.println(Util.luckStringAsciiArt());
		
        IntStream.range(0, lottoTicketsAmount)
        	.forEach(n -> {
        		
        		Collections.shuffle(betNumbersSuggestion);
        		
        		List<Integer> numbersToBet = betNumbersSuggestion.stream()
        				.limit(numbersAmountOnEachTicket)
        				.collect(Collectors.toList());
        		
        		Collections.sort(numbersToBet);
        		System.out.println(numbersToBet);
        	});
	}
}
