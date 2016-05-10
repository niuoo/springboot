package sneakerhead.java8.lambda;

import org.junit.Test;

import java.util.Optional;

/**
 * Created by wanghuiwu on 2016/5/9.
 */
public class OptionalTest {

    @Test
    public void firstTest(){
        Optional<String> fullName = Optional.of(null);
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse("Hey Stranger!" ) );
    }


//    @GET
//    @Path("/{id}")
//    public NodeTarget get(@PathParam("id") Long nodeId ) {
//        Optional<NodeTarget> optional = Optional.ofNullable(nodeTargetService.findByNodeId(nodeId));
//        return optional.orElseThrow(() -> {
//            LOGGER.info("对应目标组节点未找到");
//            return new NoSuchResourceException("目标组节点",nodeId);
//        });
//    }
}
