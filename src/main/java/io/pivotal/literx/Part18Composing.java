package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;

import java.util.function.Function;

/**
 * Learn how to compose Reactor operators into new ones
 */
public class Part18Composing {

//========================================================================================

    // TODO Create operator that returns name and surname of user (both upper case) but skips these with name White
    Function<Flux<User>, Flux<String>> nameUpperCase() {
        return null;
    }

//========================================================================================

    // TODO Create operator that returns name and surname of user
    // Name should made upper case for each even subscriber
    // and lower case for each odd one
    Function<Flux<User>, Flux<String>> nameUpperOrLowerCase() {
        return null;
    }
}
