public class ChallengePaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if( (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) || (extraBuckets < 0)) {
            return -1;
        }

        double areaWall = width * height;
        double numOfBuckets = (double) areaWall / areaPerBucket;

        double numOfBucketsCeil = Math.ceil(numOfBuckets);
        return (int) (numOfBucketsCeil - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0)  {
            return -1;
        }

        double areaWall = width * height;
        double numOfBuckets = (double) areaWall / areaPerBucket;

        double numOfBucketsCeil = Math.ceil(numOfBuckets);
        return (int) numOfBucketsCeil;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0.0 || areaPerBucket <= 0.0)  {
            return -1;
        }

        double numOfBuckets = (double) area / areaPerBucket;

        double numOfBucketsCeil = Math.ceil(numOfBuckets);
        return (int) numOfBucketsCeil;
    }

}
