/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.shortenRefs;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/shortenRefs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ShortenRefsTestGenerated extends AbstractShortenRefsTest {
    public void testAllFilesPresentInShortenRefs() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/annotation.kt");
        doTest(fileName);
    }

    @TestMetadata("callableRefsOnCompanion.kt")
    public void testCallableRefsOnCompanion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/callableRefsOnCompanion.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassNameConflict.kt")
    public void testClassNameConflict() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/ClassNameConflict.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassNameConflictNoPackageImport.kt")
    public void testClassNameConflictNoPackageImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/ClassNameConflictNoPackageImport.kt");
        doTest(fileName);
    }

    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/classObject.kt");
        doTest(fileName);
    }

    @TestMetadata("descriptorsChangeAfterImportInsertion.kt")
    public void testDescriptorsChangeAfterImportInsertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/descriptorsChangeAfterImportInsertion.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionForCompanionObject.kt")
    public void testExtensionForCompanionObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/extensionForCompanionObject.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionForObject.kt")
    public void testExtensionForObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/extensionForObject.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionForObject2.kt")
    public void testExtensionForObject2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/extensionForObject2.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctionVarInvokedWithQualifier.kt")
    public void testExtensionFunctionVarInvokedWithQualifier() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/extensionFunctionVarInvokedWithQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("hiddenByMoreSpecificDeclaration.kt")
    public void testHiddenByMoreSpecificDeclaration() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/hiddenByMoreSpecificDeclaration.kt");
        doTest(fileName);
    }

    @TestMetadata("InterfaceInExpression.kt")
    public void testInterfaceInExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/InterfaceInExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/JavaStaticMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("KotlinRepeat.kt")
    public void testKotlinRepeat() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/KotlinRepeat.kt");
        doTest(fileName);
    }

    @TestMetadata("kt11633.kt")
    public void testKt11633() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/kt11633.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14370.kt")
    public void testKt14370() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/kt14370.kt");
        doTest(fileName);
    }

    @TestMetadata("noShortening.kt")
    public void testNoShortening() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/noShortening.kt");
        doTest(fileName);
    }

    @TestMetadata("PackagesToUseStarImports.kt")
    public void testPackagesToUseStarImports() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/PackagesToUseStarImports.kt");
        doTest(fileName);
    }

    @TestMetadata("removeCompanionRefInCalleeExpression.kt")
    public void testRemoveCompanionRefInCalleeExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/removeCompanionRefInCalleeExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("removeCompanionRefWithQualifiedReceiverInCalleeExpression.kt")
    public void testRemoveCompanionRefWithQualifiedReceiverInCalleeExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/removeCompanionRefWithQualifiedReceiverInCalleeExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("shortCompanionRefInsideShortenedCall.kt")
    public void testShortCompanionRefInsideShortenedCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/shortCompanionRefInsideShortenedCall.kt");
        doTest(fileName);
    }

    @TestMetadata("UnresolvedOverload.kt")
    public void testUnresolvedOverload() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/UnresolvedOverload.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/testData/shortenRefs/constructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constructor extends AbstractShortenRefsTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/constructor"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Ambiguous.kt")
        public void testAmbiguous() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/Ambiguous.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/GenericType.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified1.kt")
        public void testLeaveQualified1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified1.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified2.kt")
        public void testLeaveQualified2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified2.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified3.kt")
        public void testLeaveQualified3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified3.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified5.kt")
        public void testLeaveQualified5() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/LeaveQualified5.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NestedClass.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedClassWithImport.kt")
        public void testNestedClassWithImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NestedClassWithImport.kt");
            doTest(fileName);
        }

        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded.kt");
            doTest(fileName);
        }

        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded2.kt");
            doTest(fileName);
        }

        @TestMetadata("NoImportNeeded3.kt")
        public void testNoImportNeeded3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/NoImportNeeded3.kt");
            doTest(fileName);
        }

        @TestMetadata("SAMConstructorFromLambda.kt")
        public void testSAMConstructorFromLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/SAMConstructorFromLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("String.kt")
        public void testString() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/String.kt");
            doTest(fileName);
        }

        @TestMetadata("WorksForClassNameRange.kt")
        public void testWorksForClassNameRange() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/WorksForClassNameRange.kt");
            doTest(fileName);
        }

        @TestMetadata("WorksForClassNameRange2.kt")
        public void testWorksForClassNameRange2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/constructor/WorksForClassNameRange2.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/shortenRefs/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Imports extends AbstractShortenRefsTest {
        public void testAllFilesPresentInImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/imports"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("importGlobalCallables.kt")
        public void testImportGlobalCallables() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/importGlobalCallables.kt");
            doTest(fileName);
        }

        @TestMetadata("leaveQualifiedConstructor.kt")
        public void testLeaveQualifiedConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/leaveQualifiedConstructor.kt");
            doTest(fileName);
        }

        @TestMetadata("leaveQualifiedType.kt")
        public void testLeaveQualifiedType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/imports/leaveQualifiedType.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/shortenRefs/java")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Java extends AbstractShortenRefsTest {
        public void testAllFilesPresentInJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/java"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("innerClassImport.kt")
        public void testInnerClassImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/innerClassImport.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClassNoImports.kt")
        public void testInnerClassNoImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/innerClassNoImports.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClassOnDemandImport.kt")
        public void testInnerClassOnDemandImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/innerClassOnDemandImport.kt");
            doTest(fileName);
        }

        @TestMetadata("staticClassNoImports.kt")
        public void testStaticClassNoImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticClassNoImports.kt");
            doTest(fileName);
        }

        @TestMetadata("staticClassOnDemandImport.kt")
        public void testStaticClassOnDemandImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticClassOnDemandImport.kt");
            doTest(fileName);
        }

        @TestMetadata("staticFieldNoImports.kt")
        public void testStaticFieldNoImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticFieldNoImports.kt");
            doTest(fileName);
        }

        @TestMetadata("staticFieldOnDemandImport.kt")
        public void testStaticFieldOnDemandImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticFieldOnDemandImport.kt");
            doTest(fileName);
        }

        @TestMetadata("staticMethodNoImports.kt")
        public void testStaticMethodNoImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticMethodNoImports.kt");
            doTest(fileName);
        }

        @TestMetadata("staticMethodOnDemandImport.kt")
        public void testStaticMethodOnDemandImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/java/staticMethodOnDemandImport.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/shortenRefs/this")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class This extends AbstractShortenRefsTest {
        public void testAllFilesPresentInThis() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/this"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("cantShortenThis.kt")
        public void testCantShortenThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/cantShortenThis.kt");
            doTest(fileName);
        }

        @TestMetadata("cantShortenThisLabel.kt")
        public void testCantShortenThisLabel() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/cantShortenThisLabel.kt");
            doTest(fileName);
        }

        @TestMetadata("shortenExtensionThis.kt")
        public void testShortenExtensionThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/shortenExtensionThis.kt");
            doTest(fileName);
        }

        @TestMetadata("shortenThis.kt")
        public void testShortenThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/shortenThis.kt");
            doTest(fileName);
        }

        @TestMetadata("shortenThisBothReceivers.kt")
        public void testShortenThisBothReceivers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/shortenThisBothReceivers.kt");
            doTest(fileName);
        }

        @TestMetadata("shortenThisLabel.kt")
        public void testShortenThisLabel() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/shortenThisLabel.kt");
            doTest(fileName);
        }

        @TestMetadata("shortenThisWithLabel.kt")
        public void testShortenThisWithLabel() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/shortenThisWithLabel.kt");
            doTest(fileName);
        }

        @TestMetadata("visitorConflict.kt")
        public void testVisitorConflict() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/this/visitorConflict.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/shortenRefs/type")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Type extends AbstractShortenRefsTest {
        public void testAllFilesPresentInType() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/type"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ClassNameInsideArguments.kt")
        public void testClassNameInsideArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassNameInsideArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassNameInsideLambda.kt")
        public void testClassNameInsideLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassNameInsideLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassSameNameAsPackage.kt")
        public void testClassSameNameAsPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/ClassSameNameAsPackage.kt");
            doTest(fileName);
        }

        @TestMetadata("delegationSpecifier.kt")
        public void testDelegationSpecifier() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/delegationSpecifier.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionType.kt")
        public void testFunctionType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/FunctionType.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericType2.kt")
        public void testGenericType2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType2.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericType3.kt")
        public void testGenericType3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/GenericType3.kt");
            doTest(fileName);
        }

        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/LeaveQualified.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NestedClass.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedClassRefInImport.kt")
        public void testNestedClassRefInImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NestedClassRefInImport.kt");
            doTest(fileName);
        }

        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NoImportNeeded.kt");
            doTest(fileName);
        }

        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NoImportNeeded2.kt");
            doTest(fileName);
        }

        @TestMetadata("NullableType.kt")
        public void testNullableType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/NullableType.kt");
            doTest(fileName);
        }

        @TestMetadata("OtherClassWithThisNameImported.kt")
        public void testOtherClassWithThisNameImported() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/OtherClassWithThisNameImported.kt");
            doTest(fileName);
        }

        @TestMetadata("SameClassTwice.kt")
        public void testSameClassTwice() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/SameClassTwice.kt");
            doTest(fileName);
        }

        @TestMetadata("SimpleAddImport.kt")
        public void testSimpleAddImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/SimpleAddImport.kt");
            doTest(fileName);
        }

        @TestMetadata("TwoClassesSameNames.kt")
        public void testTwoClassesSameNames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/type/TwoClassesSameNames.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/shortenRefs/typealias")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Typealias extends AbstractShortenRefsTest {
        public void testAllFilesPresentInTypealias() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/typealias"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("TypeAliasAsCtor.kt")
        public void testTypeAliasAsCtor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/typealias/TypeAliasAsCtor.kt");
            doTest(fileName);
        }

        @TestMetadata("TypeAliasAsObject.kt")
        public void testTypeAliasAsObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/typealias/TypeAliasAsObject.kt");
            doTest(fileName);
        }

        @TestMetadata("TypeAliasAsType.kt")
        public void testTypeAliasAsType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/typealias/TypeAliasAsType.kt");
            doTest(fileName);
        }

        @TestMetadata("TypeAliasAsTypeArgument.kt")
        public void testTypeAliasAsTypeArgument() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/shortenRefs/typealias/TypeAliasAsTypeArgument.kt");
            doTest(fileName);
        }
    }
}
