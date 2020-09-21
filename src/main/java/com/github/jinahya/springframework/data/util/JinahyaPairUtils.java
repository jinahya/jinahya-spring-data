package com.github.jinahya.springframework.data.util;

import org.springframework.data.util.Pair;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

/**
 * A utility class for {@link Pair}.
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
public abstract class JinahyaPairUtils {

    /**
     * Creates a new {@link Pair} for given elements. This method invokes {@link Pair#of(Object, Object)} method with
     * given arguments and returns the result.
     *
     * @param first  an argument for the first element.
     * @param second an argument for the second element.
     * @param <S>    first element type parameter
     * @param <T>    second element type parameter
     * @return a new instance of {@link Pair} of given elements.
     * @see Pair#of(Object, Object)
     */
    public static <S, T> Pair<S, T> pairOf(final S first, final T second) {
        return Pair.of(first, second);
    }

    /**
     * Collects specified stream of pairs to a map. This method invokes {@link Stream#collect(Collector)} method on
     * specified stream, with what {@link Pair#toMap()} method returns, and returns the result.
     *
     * @param stream the stream to be collected.
     * @param <S>    first element type parameter
     * @param <T>    second element type parameter
     * @return a collected map.
     * @see Pair#toMap()
     */
    public static <S, T> Map<S, T> collectToMap(final Stream<? extends Pair<S, T>> stream) {
        return requireNonNull(stream, "stream is null").collect(Pair.toMap());
    }

    protected JinahyaPairUtils() {
        super();
    }
}
