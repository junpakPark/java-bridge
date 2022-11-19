package bridge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BridgeMakerTest {

	@DisplayName("3 에서 20 사이의 자연수 입력하면 U와 D만 포함된 자연수만의 문자열 리스트를 반환한다. ")
	@Test
	void makeBridgeTest() {
		BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
		for (int size = 3; size <= 20; size++) {
			List<String> bridges = bridgeMaker.makeBridge(size);
			Set<String> nonDuplicateBridges = new HashSet<>(bridges);

			assertEquals(bridges.size(), size);
			assertEquals(nonDuplicateBridges.size(), 2);
			assertTrue(nonDuplicateBridges.containsAll(List.of("U", "D")));
		}
	}
}
