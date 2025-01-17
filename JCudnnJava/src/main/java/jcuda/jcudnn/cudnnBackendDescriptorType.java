/*
 * JCudnn - Java bindings for cuDNN, the NVIDIA CUDA
 * Deep Neural Network library, to be used with JCuda
 *
 * Copyright (c) 2015-2018 Marco Hutter - http://www.jcuda.org
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package jcuda.jcudnn;

public class cudnnBackendDescriptorType
{
    public static final int CUDNN_BACKEND_POINTWISE_DESCRIPTOR = 0;
    public static final int CUDNN_BACKEND_CONVOLUTION_DESCRIPTOR = 1;
    public static final int CUDNN_BACKEND_ENGINE_DESCRIPTOR = 2;
    public static final int CUDNN_BACKEND_ENGINECFG_DESCRIPTOR = 3;
    public static final int CUDNN_BACKEND_ENGINEHEUR_DESCRIPTOR = 4;
    public static final int CUDNN_BACKEND_EXECUTION_PLAN_DESCRIPTOR = 5;
    public static final int CUDNN_BACKEND_INTERMEDIATE_INFO_DESCRIPTOR = 6;
    public static final int CUDNN_BACKEND_KNOB_CHOICE_DESCRIPTOR = 7;
    public static final int CUDNN_BACKEND_KNOB_INFO_DESCRIPTOR = 8;
    public static final int CUDNN_BACKEND_LAYOUT_INFO_DESCRIPTOR = 9;
    public static final int CUDNN_BACKEND_OPERATION_CONVOLUTION_FORWARD_DESCRIPTOR = 10;
    public static final int CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_FILTER_DESCRIPTOR = 11;
    public static final int CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_DATA_DESCRIPTOR = 12;
    public static final int CUDNN_BACKEND_OPERATION_POINTWISE_DESCRIPTOR = 13;
    public static final int CUDNN_BACKEND_OPERATION_GEN_STATS_DESCRIPTOR = 14;
    public static final int CUDNN_BACKEND_OPERATIONGRAPH_DESCRIPTOR = 15;
    public static final int CUDNN_BACKEND_VARIANT_PACK_DESCRIPTOR = 16;
    public static final int CUDNN_BACKEND_TENSOR_DESCRIPTOR = 17;
    public static final int CUDNN_BACKEND_MATMUL_DESCRIPTOR = 18;
    public static final int CUDNN_BACKEND_OPERATION_MATMUL_DESCRIPTOR = 19;
    public static final int CUDNN_BACKEND_OPERATION_BN_FINALIZE_STATISTICS_DESCRIPTOR = 20;
    public static final int CUDNN_BACKEND_REDUCTION_DESCRIPTOR = 21;
    public static final int CUDNN_BACKEND_OPERATION_REDUCTION_DESCRIPTOR = 22;
    public static final int CUDNN_BACKEND_OPERATION_BN_BWD_WEIGHTS_DESCRIPTOR = 23;

    /**
     * Private constructor to prevent instantiation
     */
    private cudnnBackendDescriptorType()
    {
        // Private constructor to prevent instantiation
    }

    /**
     * Returns a string representation of the given constant
     *
     * @return A string representation of the given constant
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CUDNN_BACKEND_POINTWISE_DESCRIPTOR: return "CUDNN_BACKEND_POINTWISE_DESCRIPTOR";
            case CUDNN_BACKEND_CONVOLUTION_DESCRIPTOR: return "CUDNN_BACKEND_CONVOLUTION_DESCRIPTOR";
            case CUDNN_BACKEND_ENGINE_DESCRIPTOR: return "CUDNN_BACKEND_ENGINE_DESCRIPTOR";
            case CUDNN_BACKEND_ENGINECFG_DESCRIPTOR: return "CUDNN_BACKEND_ENGINECFG_DESCRIPTOR";
            case CUDNN_BACKEND_ENGINEHEUR_DESCRIPTOR: return "CUDNN_BACKEND_ENGINEHEUR_DESCRIPTOR";
            case CUDNN_BACKEND_EXECUTION_PLAN_DESCRIPTOR: return "CUDNN_BACKEND_EXECUTION_PLAN_DESCRIPTOR";
            case CUDNN_BACKEND_INTERMEDIATE_INFO_DESCRIPTOR: return "CUDNN_BACKEND_INTERMEDIATE_INFO_DESCRIPTOR";
            case CUDNN_BACKEND_KNOB_CHOICE_DESCRIPTOR: return "CUDNN_BACKEND_KNOB_CHOICE_DESCRIPTOR";
            case CUDNN_BACKEND_KNOB_INFO_DESCRIPTOR: return "CUDNN_BACKEND_KNOB_INFO_DESCRIPTOR";
            case CUDNN_BACKEND_LAYOUT_INFO_DESCRIPTOR: return "CUDNN_BACKEND_LAYOUT_INFO_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_CONVOLUTION_FORWARD_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_CONVOLUTION_FORWARD_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_FILTER_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_FILTER_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_DATA_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_CONVOLUTION_BACKWARD_DATA_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_POINTWISE_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_POINTWISE_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_GEN_STATS_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_GEN_STATS_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATIONGRAPH_DESCRIPTOR: return "CUDNN_BACKEND_OPERATIONGRAPH_DESCRIPTOR";
            case CUDNN_BACKEND_VARIANT_PACK_DESCRIPTOR: return "CUDNN_BACKEND_VARIANT_PACK_DESCRIPTOR";
            case CUDNN_BACKEND_TENSOR_DESCRIPTOR: return "CUDNN_BACKEND_TENSOR_DESCRIPTOR";
            case CUDNN_BACKEND_MATMUL_DESCRIPTOR: return "CUDNN_BACKEND_MATMUL_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_MATMUL_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_MATMUL_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_BN_FINALIZE_STATISTICS_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_BN_FINALIZE_STATISTICS_DESCRIPTOR";
            case CUDNN_BACKEND_REDUCTION_DESCRIPTOR: return "CUDNN_BACKEND_REDUCTION_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_REDUCTION_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_REDUCTION_DESCRIPTOR";
            case CUDNN_BACKEND_OPERATION_BN_BWD_WEIGHTS_DESCRIPTOR: return "CUDNN_BACKEND_OPERATION_BN_BWD_WEIGHTS_DESCRIPTOR";
        }
        return "INVALID cudnnBackendDescriptorType: "+n;
    }
}

