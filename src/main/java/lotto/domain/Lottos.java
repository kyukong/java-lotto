package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private static final String ERROR_NULL = "올바른 값을 입력해주세요!";

    private final List<Lotto> lottos;

    public Lottos(final List<Lotto> lottos) {
        validateLottos(lottos);
        this.lottos = new ArrayList<>(lottos);
    }

    public List<Lotto> getLottos() {
        return new ArrayList<>(lottos);
    }

    private void validateLottos(final List<Lotto> lottos) {
        if (lottos == null) {
            throw new IllegalArgumentException(ERROR_NULL);
        }
    }
}
