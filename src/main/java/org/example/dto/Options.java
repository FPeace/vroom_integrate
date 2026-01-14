package org.example.dto;

import lombok.Data;

/**
 *   vroom [OPTION...] OPTIONAL INLINE JSON
 *   -a, --host arg     host for the routing profile, optionally with a URL path,
 *                      e.g 'routing.openstreetmap.de/routed-car' (default:
 *                      car:0.0.0.0)
 *   -c, --choose-eta   choose ETA for custom routes and report violations
 *   -g, --geometry     add detailed route geometry and distance
 *   -h, --help         display this help and exit
 *   -i, --input arg    read input from a file rather than from stdin
 *   -l, --limit arg    stop solving process after 'limit' seconds
 *   -o, --output arg   write output to a file rather than stdout
 *   -p, --port arg     host port for the routing profile (default: car:5000)
 *   -r, --router arg   osrm, libosrm, ors or valhalla (default: osrm)
 *   -t, --threads arg  number of available threads (default: 4)
 *   -v, --version      output version information and exit
 *   -x, --explore arg  exploration level to use (0..5) (default: 5)
 */
@Data
public class Options {

    /**
     * 命令行参数：g代表返回路线的polyLine数据
     */
    private Boolean g = true;
    private Integer t = 20;
}
